/*
Copyright (C) 2013 u.wol@wwu.de 
 
This file is part of ComputationalEconomy.

ComputationalEconomy is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

ComputationalEconomy is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with ComputationalEconomy. If not, see <http://www.gnu.org/licenses/>.
 */

package compecon.engine.dao.hibernate.impl;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import compecon.economy.agent.Agent;
import compecon.economy.property.GoodTypeOwnership;
import compecon.economy.property.impl.GoodTypeOwnershipImpl;
import compecon.engine.dao.GoodTypeOwnershipDAO;

public class GoodTypeOwnershipDAOImpl extends
		HibernateDAOImpl<GoodTypeOwnership> implements GoodTypeOwnershipDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<GoodTypeOwnership> findAllByAgent(Agent agent) {
		return (List<GoodTypeOwnership>) getSession()
				.createCriteria(GoodTypeOwnershipImpl.class)
				.add(Restrictions.eq("agent", agent)).list();
	}

	@Override
	public GoodTypeOwnership findFirstByAgent(Agent agent) {
		Object object = getSession()
				.createCriteria(GoodTypeOwnershipImpl.class)
				.add(Restrictions.eq("agent", agent)).setMaxResults(1)
				.uniqueResult();
		if (object == null)
			return null;
		return (GoodTypeOwnershipImpl) object;
	}

}
