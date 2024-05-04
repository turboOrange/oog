package oog.macros;/* This file was generated by SableCC's ObjectMacro. */

import java.util.LinkedList;
import java.util.List;

class MUserErrorVersionsDifferent extends Macro {

    public MUserErrorVersionsDifferent(){

    }

    @Override
    void apply(
             InternalsInitializer internalsInitializer){

        internalsInitializer.setUserErrorVersionsDifferent(this);
    }

    public String build(){

        CacheBuilder cache_builder = this.cacheBuilder;

        if(cache_builder == null){
            cache_builder = new CacheBuilder();
        }
        else{
            return cache_builder.getExpansion();
        }
        this.cacheBuilder = cache_builder;
        List<String> indentations = new LinkedList<>();
        StringBuilder sbIndentation = new StringBuilder();

        StringBuilder sb0 = new StringBuilder();

        MObjectMacroUserErrorHead minsert_3 = new MObjectMacroUserErrorHead();

        sb0.append(minsert_3.build(null));
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("The Macros of the child macro must be equal to the Macros of the parent.");

        cache_builder.setExpansion(sb0.toString());
        return sb0.toString();
    }


    @Override
    String build(Context context) {
        return build();
    }
}