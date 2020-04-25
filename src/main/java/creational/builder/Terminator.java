package creational.builder;

import java.time.LocalDate;

public class Terminator {

    private int ammo;
    private String model;
    private LocalDate dateIn;
    private String gun;

    private Terminator() {
    }

    public int getAmmo() {
        return ammo;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getDateIn() {
        return dateIn;
    }

    public String getGun() {
        return gun;
    }

    public static TerminatorBuilder builder() {
        return new Terminator().new TerminatorBuilder();
    }

    public class TerminatorBuilder {

        private TerminatorBuilder() {

        }

        public TerminatorBuilder withAmmo(int ammo) {
            Terminator.this.ammo = ammo;
            return this;
        }

        public TerminatorBuilder withGun(String gun) {
            Terminator.this.gun = gun;
            return this;
        }

        public TerminatorBuilder fromCreateDate(LocalDate date) {
            Terminator.this.dateIn = date;
            return this;
        }

        public TerminatorBuilder withModel(String model) {
            Terminator.this.model = model;
            return this;
        }

        public Terminator build() {
            return Terminator.this;
        }

    }
}
