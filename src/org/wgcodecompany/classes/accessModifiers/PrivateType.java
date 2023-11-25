package org.wgcodecompany.classes.accessModifiers;

class PrivateType {

    private String name = "John";
    private int age;

    private String display() {
        System.out.println(display());
        return name;
    }

//    public static void main(String[] args) {
//        System.out.println(this.name);
//    } wont work b/c everything else is private
}
