package com.codelean.access;
import  com.codelean.access.CodeLeanA;
public class CodeLeanB {
    public static void main(String[] args) {
        new CodeLeanA().methodPublic();
        new CodeLeanA().methodProtected();
        new CodeLeanA().methodDefault();
    }
    public void methodPublic() {

    }
    public void methodProtected() {

    }
    void methodDefault() {

    }
    private void methodPrivate() {

    }
}
