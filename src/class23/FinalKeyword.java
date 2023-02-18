package class23;

public final class FinalKeyword {

    final double gravity=9.8;
    final double PI=3.14;
    final double lightspeed=299792458;

    final void changeGravity(){
        //  gravity=1.6; // we get an error because this variable is marked final
    }

}
