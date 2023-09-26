public class CheckNode {
    public static void main(String[] args) {

        node<String> test = new node<String>("something");
        node teat2 = new node("hi");
        node test3 = new node("hello");
        node test4 = new node("f", test3, test);
        test.setValue("q");
        test.setChildNode(test3);
        test.setParentNode(test);

        System.out.println(test.getValue());
        System.out.println(test.getParentNode());
        System.out.println(test.getChildNode());

    }
}
