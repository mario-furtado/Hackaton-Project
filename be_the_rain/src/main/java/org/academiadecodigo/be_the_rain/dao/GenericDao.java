package org.academiadecodigo.be_the_rain.dao;


import org.academiadecodigo.be_the_rain.models.AbstractModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class GenericDao<T extends AbstractModel> {

    protected Class<T> modelType;

    @PersistenceContext
    protected EntityManager em;

    public GenericDao(Class<T> modelType){
        this.modelType = modelType;
    }

    public void persist(T model){
        em.persist(model);
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public T findById(Integer id){
        return em.find(modelType, id);
    }

    public List<T> findAll(){

        CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(modelType);
        Root<T> root = criteriaQuery.from(modelType);
        return em.createQuery(criteriaQuery).getResultList();
    }
}
