package com.javacourse.nestedclasses.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math m = new Math();
        m.getResult(20, 40);
    }
}

class Math {

    private int variable = 10;

    public void getResult(final int argument1, int argument2){

        final int finalVariable = 21;
        int effectivellyFinalVariable = 20;

//        Variable is accessed from within inner class, needs to be final or effectively final
//        effectivellyFinalVariable=2;
//        argument2=2;


//        local inner class is not static
//        We can't use access modifier in declaration of local inner class
//        We may extend class or implement interfaces
        class Delenie{
            private int delimoe;
            private int delitel;

//            void abs(){
//                effectivellyFinalVariable=20;
//            }

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe(){
                return delimoe/delitel;
            }

            public int getOstatok(){
                return delimoe%delitel;
            }

            public void getVariable(){
                System.out.println("Outer method final variable: " + finalVariable);
                System.out.println("Outer method effectivelly final variable: " + effectivellyFinalVariable);
                System.out.println("Outer method arguments: " + argument1 + argument2);
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("Delimoe: " + delenie.getDelimoe());
        System.out.println("Delitel: " + delenie.getDelitel());
        System.out.println("Chastnoe: " + delenie.getChastnoe());
        System.out.println("Ostatok: " + delenie.getOstatok());
        System.out.println("Outer class variable: " + variable);
        delenie.getVariable();

    }
}