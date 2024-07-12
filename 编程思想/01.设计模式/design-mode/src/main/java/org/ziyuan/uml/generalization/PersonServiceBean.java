package org.ziyuan.uml.generalization;

public class PersonServiceBean extends DaoSupper{
}

abstract class DaoSupper{
    public void save(Object entity){}
    public void delete(Object id){}
}