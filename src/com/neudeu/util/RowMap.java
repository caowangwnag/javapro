package com.neudeu.util;

import java.sql.ResultSet;

public interface RowMap<T> {
    T rowMapping(ResultSet resultSet);
}
