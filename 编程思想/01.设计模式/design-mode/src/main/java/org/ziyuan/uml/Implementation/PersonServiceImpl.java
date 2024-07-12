package org.ziyuan.uml.Implementation;

/**
 * @author szy
 * @description
 * @date 2024/7/12 9:04
 */
public class PersonServiceImpl implements PersonService {
    @Override
    public void delete(Integer id) {
        System.out.println("删除成功！");
    }
}

interface PersonService {
    void delete(Integer id);
}
