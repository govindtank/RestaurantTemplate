package com.leeandjosh.restauranttemplate;

import android.support.v4.app.Fragment;

public class CheckoutActivity extends SingleFragmentActivity {
	
	
	

	@Override
	protected Fragment createFragment() {
		return new CheckoutFragment();
	}

}
