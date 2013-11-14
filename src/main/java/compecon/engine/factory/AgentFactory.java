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

package compecon.engine.factory;

import java.util.List;
import java.util.Set;

import compecon.economy.agent.Agent;
import compecon.economy.sectors.financial.CentralBank;
import compecon.economy.sectors.financial.CreditBank;
import compecon.economy.sectors.financial.Currency;
import compecon.economy.sectors.household.Household;
import compecon.economy.sectors.industry.Factory;
import compecon.economy.sectors.state.State;
import compecon.economy.sectors.trading.Trader;
import compecon.materia.GoodType;

public interface AgentFactory {

	public List<Class<? extends Agent>> getAgentTypes();

	public State getInstanceState(final Currency currency);

	public CentralBank getInstanceCentralBank(final Currency currency);

	public CreditBank newInstanceCreditBank(final Currency offeredCurrency);

	public CreditBank newInstanceCreditBank(
			final Set<Currency> offeredCurrencies,
			final Currency primaryCurrency);

	public CreditBank getRandomInstanceCreditBank(final Currency currency);

	public List<CreditBank> getAllCreditBanks(Currency currency);

	public Factory newInstanceFactory(final GoodType goodType,
			final Currency primaryCurrency);

	public List<Factory> getAllFactories();

	public Household newInstanceHousehold(final Currency primaryCurrency);

	public Trader newInstanceTrader(final Currency primaryCurrency);

	public void deleteAgent(final Agent agent);
}