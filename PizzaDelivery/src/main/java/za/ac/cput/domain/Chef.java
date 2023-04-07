package za.ac.cput.domain;

import java.util.Objects;

public class Chef extends Employee {
    private String chefId;
    private String nationality;
    private String culinaryExperience;

    public Chef() {

    }

    //    public Chef(String empId, String empName, String empSurname, String chefId, String nationality, String culinaryExperience) {
//        super(empId, empName, empSurname);
//        this.chefId = chefId;
//        this.nationality = nationality;
//        this.culinaryExperience = culinaryExperience;
//    }
    private Chef(Builder builder){
        this.chefId = builder.chefId;
        this.nationality = builder.nationality;
        this.culinaryExperience = builder.culinaryExperience;
    }

    public String getChefId() {
        return chefId;
    }

//    public void setChefId(String chefId) {
//        this.chefId = chefId;
//    }

    public String getNationality() {
        return nationality;
    }

//    public void setNationality(String nationality) {
//        this.nationality = nationality;
//    }

    public String getCulinaryExperience() {
        return culinaryExperience;
    }

//    public void setCulinaryExperience(String culinaryExperience) {
//        this.culinaryExperience = culinaryExperience;
//    }

    public static class Builder {
        private String chefId;
        private String nationality;
        private String culinaryExperience;

        public Builder(String chefId, String nationality, String culinaryExperience) {
            this.chefId = chefId;
            this.nationality = nationality;
            this.culinaryExperience = culinaryExperience;
        }

        public Builder() {

        }


        public String getChefId() {
            return chefId;
        }

        public Builder setChefId(String chefId) {
            this.chefId = chefId;
            return this;
        }

        public String getNationality() {
            return nationality;
        }

        public Builder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public String getCulinaryExperience() {
            return culinaryExperience;
        }

        public Builder setCulinaryExperience(String culinaryExperience) {
            this.culinaryExperience = culinaryExperience;
            return this;
        }

        public Builder copy(Chef chef){
            this.chefId = chef.chefId;
            this.nationality = chef.nationality;
            this.culinaryExperience = chef.culinaryExperience;
            return this;
        }
        public Chef build() {return new Chef(this);}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Chef chef = (Chef) o;
            return chefId == chef.chefId && nationality == chef.nationality &&  culinaryExperience == chef.culinaryExperience;
        }

        @Override
        public int hashCode() {
            return Objects.hash(chefId, nationality, culinaryExperience);
        }

    }
}
