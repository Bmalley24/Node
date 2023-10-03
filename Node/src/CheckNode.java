public class CheckNode {
    public static void main(String[] args) {

        //all the nodes i need to check mothods
        node test = new node();
        node test2 = new node("hi");
        node test3 = new node("hello");
        node test4 = new node("f", test3, test);
        node test5 = new node("hi");

        //does default constructor work
        System.out.println(test);

        //testing is set mothods work
        test.setChildNode(test2);
        test.setParentNode(test3);
        test.setValue(8);

        //printing the all nodes in the node to check if the set method and get mothods work
        System.out.println(test.getValue());
        System.out.println(test.getParentNode());
        System.out.println(test.getChildNode());

        //checking if toString works
        String testing = test.toString();
        System.out.println(testing);

        //checking id the big constructor works and all its values are right
        System.out.println(test4.getValue());
        System.out.println(test4.getChildNode());
        System.out.println(test4.getParentNode());

        //checking if booleanEquals works
        Boolean B = test5.booleanEquals(test2);
        System.out.println(B);
        Boolean C = test5.booleanEquals(test3);
        System.out.println(C);

    }
}
