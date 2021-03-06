package puck.thrifty.datatype;

import puck.thrifty.MergerException;


public interface Element {
   
   public boolean isObject();
   public boolean isUnknown();
   public boolean isList();
   
   public boolean hasObject();
   public Element getObject();
   public String getDatatypeName();
   public String getName();
   public void setName(String name);
   public boolean isRequired();
   public void setRequired(boolean isRequired);
   public int getOrder();
   public void setOrder(int order);
   
   public Element merge(Element element) throws MergerException;
   public String write();
}
