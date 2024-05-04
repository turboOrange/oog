package oog.macros;/* This file was generated by SableCC's ObjectMacro. */

import java.util.LinkedList;
import java.util.List;

class MUserErrorIncorrectType extends Macro {

       private String field_Type;

       private String field_ParamName;

       public MUserErrorIncorrectType(
                    String pType,
                    String pParamName){

           this.setPType(pType);
           this.setPParamName(pParamName);
       }

       private void setPType( String pType ){
           if(pType == null){
               throw ObjectMacroException.parameterNull("Type");
           }

           this.field_Type = pType;
       }

       private void setPParamName( String pParamName ){
           if(pParamName == null){
               throw ObjectMacroException.parameterNull("ParamName");
           }

           this.field_ParamName = pParamName;
       }

       private String buildType(){

           return this.field_Type;
       }

       private String buildParamName(){

           return this.field_ParamName;
       }

       private String getType(){

           return this.field_Type;
       }

       private String getParamName(){

           return this.field_ParamName;
       }

       @Override
       void apply(
               InternalsInitializer internalsInitializer){

           internalsInitializer.setUserErrorIncorrectType(this);
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

           MObjectMacroUserErrorHead minsert_1 = new MObjectMacroUserErrorHead();

           sb0.append(minsert_1.build(null));
           sb0.append(LINE_SEPARATOR);
           sb0.append(LINE_SEPARATOR);
           sb0.append(buildType());
           sb0.append(" was not expected in parameter '");
           sb0.append(buildParamName());
           sb0.append("'.");

           cache_builder.setExpansion(sb0.toString());
           return sb0.toString();
       }

       @Override
       String build(Context context) {
           return build();
       }
   }