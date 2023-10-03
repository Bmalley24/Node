public class CheckNode {
    public static void main(String[] args) {

        node test = new node();
        node test2 = new node("hi");
        node test3 = new node("hello");
        node test4 = new node("f", test3, test);
        node test5 = new node("something");

        test.setChildNode(test2);
        test.setParentNode(test3);

        System.out.println(test.getValue());
        System.out.println(test.getParentNode());
        System.out.println(test.getChildNode());

    }
}
