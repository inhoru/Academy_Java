package com.inter.common;

import com.inter.model.vo.Fruit;

@FunctionalInterface
public interface FilterFruit {
	boolean check(Fruit f,Object data);
}
