package com.everis.taskmanager.services_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.taskmanager.model.EverisProject;
import com.everis.taskmanager.model.EverisUser;
import com.everis.taskmanager.repository.EverisProjectRepository;
import com.everis.taskmanager.repository.EverisUserRepository;
import com.everis.taskmanager.services.EverisProjectService;

@Service
public class EverisProjectServiceImpl implements EverisProjectService {

	@Autowired
	private EverisProjectRepository projectRepository;

	@Autowired
	private EverisUserRepository userRepository;

	@Override
	public EverisProject createProject(EverisProject project) {

		projectRepository.save(project);
		return project;
	}

	@Override
	public List<EverisProject> getProjects() {
		return (List<EverisProject>) projectRepository.findAll();
	}

	@Override
	public EverisProject getProjectById(Integer id) {
		return projectRepository.findById(id).get();
	}

	@Override
	public List<EverisProject> deleteProjectById(Integer id) {
		projectRepository.deleteById(id);
		return getProjects();
	}

	@Override
	public EverisProject updateProjectById(EverisProject p, Integer id) {
		EverisProject p1 = projectRepository.findById(id).get();
		if (p.getProjectName() != null && p.getProjectName().compareTo("") != 0) {
			p1.setProjectName(p.getProjectName());
		}
		if (p.getProjectDescription() != null && p.getProjectDescription().compareTo("") != 0) {
			p1.setProjectDescription(p.getProjectDescription());
		}
		projectRepository.save(p1);
		return p1;
	}

	@Override
	public EverisProject addUserById(Integer idp, Integer idu) {
		EverisProject p1 = projectRepository.findById(idp).get();
		EverisUser u1 = userRepository.findById(idu).get();

		p1.addUser(u1);
		projectRepository.save(p1);

		return p1;
	}

	@Override
	public EverisProject deleteUserFromProject(Integer idp, Integer idu) {

		EverisUser u = userRepository.findById(idu).get();

		EverisProject p = projectRepository.findById(idp).get();

		p.getUsers().remove(u);

		projectRepository.save(p);
		return p;
	}

}
