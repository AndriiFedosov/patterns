package structural.composite;

import org.testng.annotations.Test;
import structural.composite.expression.AndExpression;
import structural.composite.expression.CriteriaExpression;
import structural.composite.expression.OrExpression;
import structural.composite.fields.SearchField;

import static org.assertj.core.api.Assertions.assertThat;

public class CompositeTest {
    @Test
    public void should_create_criteria_to_search() {
        //given
        String expectedSearchString = "(name=sasha && age>3 && width<70) || (nationality!=ukranian)";
        CriteriaExpression criteriaExpression = new CriteriaExpression();
        criteriaExpression.add(
                AndExpression.builder().operation(SearchField.NAME.eq("sasha")).build(),
                AndExpression.builder().operation(SearchField.AGE.greatThen(3)).build(),
                OrExpression.builder().operation(SearchField.NATIONALITY.notEq("ukranian")).build(),
                AndExpression.builder().operation(SearchField.WIDTH.lessThen(70)).build()
        );

        //when
        String result = criteriaExpression.creteSearchString();
        //then
        assertThat(result).isEqualTo(expectedSearchString);
    }
}
