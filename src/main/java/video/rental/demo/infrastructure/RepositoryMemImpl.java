package video.rental.demo.infrastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import video.rental.demo.domain.model.Customer;
import video.rental.demo.domain.model.Repository;
import video.rental.demo.domain.model.Video;

public class RepositoryMemImpl implements Repository{
	
	private Map<Integer, Customer> customers = new HashMap<>();
	private Map<String, Video> videos = new HashMap<>();

	@Override
	public Customer findCustomerById(int code) {
		// TODO Auto-generated method stub
		return customers.get(code);
	}

	@Override
	public Video findVideoByTitle(String title) {
		// TODO Auto-generated method stub
		return videos.get(title);
	}

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return customers.values().stream().collect(Collectors.toList());
	}

	@Override
	public List<Video> findAllVideos() {
		// TODO Auto-generated method stub
		return videos.values().stream().collect(Collectors.toList());
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customers.put(customer.getCode(), customer);
	}

	@Override
	public void saveVideo(Video video) {
		// TODO Auto-generated method stub
		videos.put(video.getTitle(), video);
	}

}
