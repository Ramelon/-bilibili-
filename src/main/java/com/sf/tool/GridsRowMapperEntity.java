package com.sf.tool;

import com.sf.entity.gridsEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


//用户表
public class GridsRowMapperEntity implements RowMapper<gridsEntity>{

	public gridsEntity mapRow(ResultSet arg0, int arg1) throws SQLException {
		gridsEntity grids = new gridsEntity();
		//user.setUseryinghangka(arg0.getString("useryinghangka"));
		grids.setGridsID(arg0.getString("gridsID"));
		
		grids.setGirdsName(arg0.getString("girdsName"));
		grids.setGirdskucun(arg0.getInt("girdskucun"));
		grids.setGirdsjiage(arg0.getString("girdsjiage"));
		grids.setGirdsimg(arg0.getString("girdsimg"));
		return grids;
	}

	
	
}
