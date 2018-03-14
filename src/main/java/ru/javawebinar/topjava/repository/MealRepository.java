package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.to.MealWithExceed;

import java.util.Collection;
import java.util.List;

public interface MealRepository {

    MealWithExceed save(Meal meal, int userId);

    boolean delete(int id, int userId);

    MealWithExceed get(int id, int userId);

    List<MealWithExceed> getAll(int userId);
}
