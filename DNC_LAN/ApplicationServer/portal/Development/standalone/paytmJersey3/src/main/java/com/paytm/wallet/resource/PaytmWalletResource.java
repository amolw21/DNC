package com.paytm.wallet.resource;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/paytm-wallet")
public class PaytmWalletResource {
	@GET
	@Produces("text/plain")
	public double getBalance()
	{
		double balance=0.0;
		Random random=null;
		random=new Random(5000);
		balance=random.nextDouble();
		return balance;
	}

}
