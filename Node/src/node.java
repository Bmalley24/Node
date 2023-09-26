/**
 * node
 * Author: Brandon Malley
 * Collaborator: Roan
 * Date: 9/25/2023
 **/

public class node<T> {
    private node parentNode;
    private node childNode;

    private T value;


    public node() {//Empty Consructor
        parentNode = null;
        childNode = null;
        value = null;

    }
    public node(T data){ // 1 imput Constructor
        value = data;
        parentNode = null;
        childNode = null;

    }

    public node (T data, node node1, node node2) { // 3 inputConstructor
        parentNode = node1;
        childNode = node2;
        value = data;
    }

    //Accessors
    public node getParentNode() {
        return parentNode;
    }

    public node getChildNode() {
        return childNode;
    }

    public T getValue() {
        return value;
    }

    //Mutators
    public void setParentNode(node newNode){
        parentNode.equals(newNode);
    }
    public void setChildNode(node newNode){
        childNode.equals(newNode);
    }
    public void setValue(T newValue){
        value.equals(newValue);
    }

    //toString method
    public String toString() {
        return "Node:" + value;
    }

    //boolean method
    public boolean booleanEquals(node a) {
        if (getValue().equals(a)){
            return true;
        } else{
            return false;
        }

    }
}






