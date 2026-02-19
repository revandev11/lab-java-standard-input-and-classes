package org.example;

public class intern {

    class Intern extends employee {
        private static final double MAX_SALARY = 20000.0;

        public Intern(String name, String email, int age, double salary) {
            super(name, email, age, Math.min(salary, MAX_SALARY));

        }

        public void SetSalary(double salary) {
            this.salary = Math.min(salary, MAX_SALARY);

        }


    }



}
