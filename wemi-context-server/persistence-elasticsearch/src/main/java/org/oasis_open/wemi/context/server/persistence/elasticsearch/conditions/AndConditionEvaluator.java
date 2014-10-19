package org.oasis_open.wemi.context.server.persistence.elasticsearch.conditions;

import org.oasis_open.wemi.context.server.api.Item;
import org.oasis_open.wemi.context.server.api.conditions.Condition;

import java.util.List;
import java.util.Map;

/**
 * Evaluator for AND condition
 */
public class AndConditionEvaluator implements ConditionEvaluator {

    @Override
    public boolean eval(Condition condition, Item item, Map<String, Object> context, ConditionEvaluatorDispatcher dispatcher) {
        List<Condition> conditions = (List<Condition>) condition.getParameterValues().get("subConditions");
        for (Condition sub : conditions) {
            if (!dispatcher.eval(sub, item, context)) {
                return false;
            }
        }
        return true;
    }
}