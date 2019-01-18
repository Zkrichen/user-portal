package com.zkrichen.userportal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		List<User> user = new ArrayList<User>();
		User usr1= new User(1,"z","z","z");
		user.add(usr1);
		return user;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

//    @Autowired
//    private UserRepository repository;
//
//    @Override
//    public User create(User user) {
//        return repository.save(user);
//    }
//
//    @Override
//    public User delete(int id) {
//        User user = findById(id);
//        if(user != null){
//            repository.delete(user);
//        }
//        return user;
//    }
//
//    @Override
//    public List<User> findAll() {
//        return repository.findAll();
//    }
//
//    @Override
//    public User findById(int id) {
//        return repository.findOne(id);
//    }
//
//    @Override
//    public User update(User user) {
//        return null;
//    }
}
