package kata.dev.services;

import kata.dev.entities.OfferRule;
import kata.dev.entities.Order;

import java.util.List;

/**
 * Interface qui définit le comportement commu à toute stratégie de
 * vente : vente normale, vente promotionnelle
 *
 * @author Jean Pierre NSEM
 */


public interface IOrder<O> {

    // spécifie la stratégie de vente
    public int checkout(List<O> oList, List<OfferRule> offerRules);
}
