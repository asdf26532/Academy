package model;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface Mapper <T> {
	T maping(ResultSet rs) throws SQLException; 
}
