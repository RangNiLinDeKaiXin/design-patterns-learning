package com.lcc.responsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: lcc
 * @Date: 2018-06-07
 **/

public abstract class Leader {
	@Getter
 	private String name;
	@Getter
	@Setter
 	private Leader nextLeader;

	public Leader(String name) {
		this.name = name;
	}

	public abstract void handleRequest(LeaveRequest request);
}
