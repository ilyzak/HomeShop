package homeShope.Test;

import homShop.Writer;

public class BillTest {
	 private String output;
	    private Writer writerMock = new Writer() {
	        @Override
	        public void start() {
	            output = "";
	        }

	        @Override
	        public void writeLine(String line) {
	            output += line + "%n";
	        }

	        @Override
	        public void stop() {
	        }
	    };
}
