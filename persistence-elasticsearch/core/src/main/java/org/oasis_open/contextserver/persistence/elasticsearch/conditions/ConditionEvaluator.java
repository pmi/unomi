package org.oasis_open.contextserver.persistence.elasticsearch.conditions;

import org.oasis_open.contextserver.api.Item;
import org.oasis_open.contextserver.api.conditions.Condition;

import java.util.Map;

/**
 * Condition evaluator interface
 */
public interface ConditionEvaluator {

    public boolean eval(Condition condition, Item item, Map<String, Object> context, ConditionEvaluatorDispatcher dispatcher);

}