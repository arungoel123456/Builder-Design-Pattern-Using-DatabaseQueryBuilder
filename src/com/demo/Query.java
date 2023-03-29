package com.demo;

public class Query {
    private String select;
    private String from;
    private String where;
    private String orderBy;

    public void setSelect(String select){
        this.select = select;
    }

    public void setFrom(String from){
        this.from = from;
    }

    public void setWhere(String where){
        this.where = where;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public String toString(){
        if(this.select == null || this.from == null){
            return "Error in the Query must contain both SELECT and FROM blocks";
        }
        else if(this.where == null){
            return "SELECT " + this.select + " FROM " + this.from;
        }else{
            return "SELECT " + this.select + " FROM " + this.from + " WHERE " + this.where;
        }
    }
}
