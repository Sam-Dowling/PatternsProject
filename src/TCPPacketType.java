
class TCPPacketType implements PacketType{

    @Override
    public String packData(String data) {
        return String.format(":TCP:%s:TCP:", data);
    }

    @Override
    public String unpackData(String data) {
        return data.replaceAll(":TCP:", "");
    }
}
