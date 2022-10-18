package miHexagonal.core.driver_ports;

import miHexagonal.core.domain.*;

public interface BookRepository  {
	Book findById(Long id);
}
