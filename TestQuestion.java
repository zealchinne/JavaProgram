class TestQuestion {

public enum Cars {ferari, maruti, omni};

public static void main(String [] args) {

Cars mycar = Cars.ferari;

switch (mycar) {

case ferari:

System.out.print("ferari ");

default:// don't use like this

System.out.print("mercedez ");

case maruti:

System.out.print("maruti ");

}

}

}

}