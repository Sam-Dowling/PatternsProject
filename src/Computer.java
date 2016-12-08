
class Computer extends Networkable{
    final OperatingSystem os = new Windows();

    Computer(Router r){
        os.startOS(r);
    }
}
