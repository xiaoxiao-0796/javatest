package com.xiaofei.base.model.builder;


public class Person {

    private String head;
    private String boby;
    private String foot;

    public static void main(String[] args) {
        System.out.println("111");
    }

    Person(String head, String boby, String foot) {
        this.head = head;
        this.boby = boby;
        this.foot = foot;
    }

    public static Person.PersonBuilder builder() {
        return new Person.PersonBuilder();
    }

    public static class PersonBuilder {
        private String head;
        private String boby;
        private String foot;

        PersonBuilder() {
        }

        public Person.PersonBuilder head(String head) {
            this.head = head;
            return this;
        }

        public Person.PersonBuilder boby(String boby) {
            this.boby = boby;
            return this;
        }

        public Person.PersonBuilder foot(String foot) {
            this.foot = foot;
            return this;
        }

        public Person build() {
            return new Person(this.head, this.boby, this.foot);
        }

        public String toString() {
            return "Person.PersonBuilder(head=" + this.head + ", boby=" + this.boby + ", foot=" + this.foot + ")";
        }
    }
}
