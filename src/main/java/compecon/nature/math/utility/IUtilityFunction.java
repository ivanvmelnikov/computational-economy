/*
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

package compecon.nature.math.utility;

import java.util.Map;
import java.util.Set;

import compecon.engine.Agent;
import compecon.nature.materia.GoodType;

public interface IUtilityFunction {

	public Set<GoodType> getInputGoodTypes();

	public void setAgent(Agent agent);

	public double calculateUtility(Map<GoodType, Double> bundleOfGoods);

	public double calculateMarginalUtility(Map<GoodType, Double> bundleOfGoods,
			GoodType differentialGoodType);

	public Map<GoodType, Double> calculateUtilityMaximizingInputsUnderBudgetRestriction(
			Map<GoodType, Double> pricesOfGoods, double budget);
}