package oog.macros;/* This file was generated by SableCC's ObjectMacro. */



class DBeforeFirst
        extends Directive {

    DBeforeFirst(String value) {

        super(value);
    }

    @Override
    String apply(
            Integer index,
            String macro,
            Integer list_size) {

        if(index == 0){
            return this.value.concat(macro);
        }
        return macro;
    }
}
