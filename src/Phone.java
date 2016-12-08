
class Phone extends Networkable{
    final OperatingSystem os = new Android();

    Phone(Router r){
        os.startOS(r);
    }

}
