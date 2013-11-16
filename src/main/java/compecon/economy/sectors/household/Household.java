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

package compecon.economy.sectors.household;

import compecon.economy.agent.Agent;
import compecon.economy.behaviour.PricingBehaviour;
import compecon.math.intertemporal.IntertemporalConsumptionFunction;
import compecon.math.utility.UtilityFunction;

public interface Household extends Agent {

	public void setAgeInDays(int ageInDays);

	public void setIntertemporalConsumptionFunction(
			final IntertemporalConsumptionFunction intertemporalConsumptionFunction);

	public void setPricingBehaviour(final PricingBehaviour pricingBehaviour);

	public void setUtilityFunction(UtilityFunction utilityFunction);
}
