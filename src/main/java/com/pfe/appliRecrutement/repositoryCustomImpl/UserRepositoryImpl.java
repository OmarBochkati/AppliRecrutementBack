package com.pfe.appliRecrutement.repositoryCustomImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Service;

import com.pfe.appliRecrutement.domain.Role;
import com.pfe.appliRecrutement.domain.User;
import com.pfe.appliRecrutement.repositoryCustom.UserRepositoryCustom;

@Service
public class UserRepositoryImpl implements UserRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<User> getUsersByRole(Role role) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<User> criteria = cb.createQuery( User.class );
		Root<User> userRoot = criteria.from( User.class );
		criteria.select( userRoot );
		criteria.where(cb.equal(userRoot.get("role") , role));
		List<User> users = em.createQuery(criteria).getResultList();
		return users;
	}

}
