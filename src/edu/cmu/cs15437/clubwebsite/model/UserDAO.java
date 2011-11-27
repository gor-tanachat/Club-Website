package edu.cmu.cs15437.clubwebsite.model;

import edu.cmu.cs15437.clubwebsite.databeans.UserBean;

import org.mybeans.dao.DAOException;
import org.mybeans.factory.BeanTable;
import org.mybeans.factory.BeanFactory;
import org.mybeans.factory.BeanFactoryException;
import org.mybeans.factory.Transaction;
import org.mybeans.factory.RollbackException;
import org.mybeans.factory.MatchArg;

import java.util.*;

public class UserDAO {
	private BeanFactory< UserBean > factory;
	
	public UserDAO() throws DAOException {
		try {
			BeanTable< UserBean > table = BeanTable.getInstance(UserBean.class, "clubweb_user");
			if(! table.exists()) table.create("userId");
			table.setIdleConnectionCleanup(true);
			factory = table.getFactory();
		} catch (BeanFactoryException e) {
			throw new DAOException(e);
		}
	}
	
	protected BeanFactory< UserBean > getFactory() {
		return factory;
	}
	
	public UserBean lookupUserName(String userName) throws DAOException {
		try {
			return factory.match(MatchArg("userName", userName));
		} catch (RollbackException e) {
			throw new DAOException(e);
		}
	}
	
	public UserBean lookupEmailAddress(String emailAddress) throws DAOException {
		try {
			return factory.match(MatchArg("emailAddress", emailAddress));
		} catch (RollbackException e) {
			throw new DAOException(e);
		}
	}
	
	public UserBean[] getAllUsers() throws DAOException {
		try {
			UserBean[] users = factory.match();
			Arrays.sort(users); // Sort using UserBean's compareTo()
			return users;
		} catch (RollbackException e) {
			throw new DAOException(e);
		}
	}
	
	public UserBean create(UserBean user) throws DAOException {
		try {
			Transaction.begin();
			UserBean dbUser = factory.create();
			factory.copyInto(user, dbUser);
			Transaction.commit();
			return dbUser;
		} catch (RollbackException e) {
			throw new DAOException(e);
		} finally {
			if (Transaction.isActive()) Transaction.rollback();
			return null;
		}
	}
	
	public boolean destroy(int userId) {
		try {
			factory.delete(userId);
		} catch (RollbackException e) {
			throw new DAOException(e);
		} finally {
			if (Transaction.isActive()) Transaction.rollback();
			return false;
		}
	}
	
	public boolean updatePassword(int userId, String password) throws DAOException {
		try {
			Transaction.begin();
			UserBean dbUser = factory.lookup(userId);
			if (dbUser == null) {
				throw new DAOException("UserBean " + String.valueOf(userId) + " does not exist");
			}
			dbUser.setPassword(password);
			Transaction.commit();
			return true;
		} catch (RollbackException e) {
			throw new DAOException(e);
		} finally {
			if (Transaction.isActive()) Transaction.rollback();
			return false;
		}
	}
	
	public boolean updateFirstName(int userId, String firstName) throws DAOException {
		try {
			Transaction.begin();
			UserBean dbUser = factory.lookup(userId);
			if (dbUser == null) {
				throw new DAOException("UserBean " + String.valueOf(userId) + " does not exist");
			}
			dbUser.setFirstName(firstName);
			Transaction.commit();
			return true;
		} catch (RollbackException e) {
			throw new DAOException(e);
		} finally {
			if (Transaction.isActive()) Transaction.rollback();
			return false;
		}
	}
	
	public boolean updateLastName(int userId, String lastName) throws DAOException {
		try {
			Transaction.begin();
			UserBean dbUser = factory.lookup(userId);
			if (dbUser == null) {
				throw new DAOException("UserBean " + String.valueOf(userId) + " does not exist");
			}
			dbUser.setLastName(lastName);
			Transaction.commit();
			return true;
		} catch (RollbackException e) {
			throw new DAOException(e);
		} finally {
			if (Transaction.isActive()) Transaction.rollback();
			return false;
		}
	}
	
	public boolean updateSex(int userId, String sex) throws DAOException {
		try {
			Transaction.begin();
			UserBean dbUser = factory.lookup(userId);
			if (dbUser == null) {
				throw new DAOException("UserBean " + String.valueOf(userId) + " does not exist");
			}
			dbUser.setSex(sex);
			Transaction.commit();
			return true;
		} catch (RollbackException e) {
			throw new DAOException(e);
		} finally {
			if (Transaction.isActive()) Transaction.rollback();
			return false;
		}
	}
	
	public boolean updateUserGroup(int userId, int userGroup) throws DAOException {
		try {
			Transaction.begin();
			UserBean dbUser = factory.lookup(userId);
			if (dbUser == null) {
				throw new DAOException("UserBean " + String.valueOf(userId) + " does not exist");
			}
			dbUser.setUserGroup(userGroup);
			Transaction.commit();
			return true;
		} catch (RollbackException e) {
			throw new DAOException(e);
		} finally {
			if (Transaction.isActive()) Transaction.rollback();
			return false;
		}
	}
	
	public boolean renewMembership(int userId, Date newMembershipExpirationDate) throws DAOException {
		try {
			Transaction.begin();
			UserBean dbUser = factory.lookup(userId);
			if (dbUser == null) {
				throw new DAOException("UserBean " + String.valueOf(userId) + " does not exist");
			}
			dbUser.setMembershipExpirationDate(newMembershipExpirationDate);
			Transaction.commit();
			return true;
		} catch (RollbackException e) {
			throw new DAOException(e);
		} finally {
			if (Transaction.isActive()) Transaction.rollback();
			return false;
		}
	}
}

