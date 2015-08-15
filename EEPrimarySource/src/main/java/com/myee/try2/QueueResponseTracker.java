package com.myee.try2;

import com.myee.model.RequestQueue;

/**
 * Created  on 8/14/2015.
 */
//can extend this. But will not do let the implementor do it
public interface QueueResponseTracker {
	void waitForRespose(RequestQueue requestQueue) ;
}
