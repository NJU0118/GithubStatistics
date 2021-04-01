package edu.nju.githubstatistics.dao.impl;

import edu.nju.githubstatistics.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:14
 * @description: BaseDaoImpl
 */

@Repository
@SuppressWarnings("unchecked")
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
    @PersistenceContext
    private EntityManager entityManager;

    protected Class<T> clazz;

    /*
     * 用反射获取具体类型
     */
    public BaseDaoImpl() {
        if (this.getClass().getGenericSuperclass() instanceof ParameterizedType) {
            ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
            clazz = (Class<T>) type.getActualTypeArguments()[0];
        }
    }

    /*
    sessionFactory.getCurrentSession():
        创建的session会绑定到当前线程；session会在事务提交或回滚后自动关闭；
    sessionFactory.openSession():
        每次调用会生成一个新的session；session在事务提交或回滚后需要手动关闭；
    entityManager:
        entityManager是JPA的api，而sessionFactory是hibernate的；两者是接口和实现的关系；
        entityManager.unwrap(Session.class)相当于获取JPA底层的hibernate实现；
        entityManager通过@PersistenceContext由Spring统一管理后不需要手动关闭；
        默认为“Entity Manager per transaction”模式。
     */
    protected final Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    @Override
    public List<T> getResultsByHQL(String hql) {
        Query query = getSession().createQuery(hql);
        return query.list();
    }
}
