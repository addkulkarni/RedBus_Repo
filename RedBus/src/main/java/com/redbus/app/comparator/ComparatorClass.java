package com.redbus.app.comparator;

import java.util.Comparator;
import java.util.LinkedHashMap;

public class ComparatorClass implements Comparator<LinkedHashMap<String, Object>>
{
	@Override
	public int compare(LinkedHashMap<String, Object> o1, LinkedHashMap<String, Object> o2)
	{
		Integer price1 = (Integer) o1.get("price");
		Integer price2 = (Integer) o2.get("price");
		return -(price1-price2);
	}
}
