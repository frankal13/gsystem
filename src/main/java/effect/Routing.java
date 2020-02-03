package effect;

public class Routing {
	private static final int ROUTING_OFFSET = 0x2b;
	private String routing;

	public void set(byte[] body) {
		int b = body[ROUTING_OFFSET];
		switch (b) {
		case 8:
			routing = "seriell";
			break;
		case 9:
			routing = "parallel";
			break;
		case 10:
			routing = "semi parallel";
			break;
		case 11:
			routing = "seriell 2";
			break;

		default:
			break;
		}
	}

	public String getRouting() {
		return routing;
	}
}
