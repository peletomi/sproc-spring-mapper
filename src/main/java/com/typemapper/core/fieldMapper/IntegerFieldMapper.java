package com.typemapper.core.fieldMapper;

import org.apache.log4j.Logger;

import com.typemapper.core.TypeMapper;

public class IntegerFieldMapper implements FieldMapper {
	
	private static final Logger LOG = Logger.getLogger(TypeMapper.class);

	@Override
	public Object mapField(String string) {
		try {
			return Integer.parseInt(string);
		} catch (NumberFormatException e) {
			LOG.error("Could not convert " + string + " to int.", e);
		}
		return null;
	}

}