import axios from 'axios'


const TRAINER_API_URL = 'http://localhost:8080/'


class TrainerDataService {

    retrieveAllTrainers() {
        return axios.get(`${TRAINER_API_URL}/trainers/getTrainers`);
    }

    retrieveTrainer(id) {
        return axios.get(`${TRAINER_API_URL}/trainers/getTrainerById`);
    }

    createTrainer(trainer) {
		const str = JSON.stringify(this.trainer);
        return axios.post(`${TRAINER_API_URL}/trainers/addTrainer`, str);
    }
   
}

export default new TrainerDataService()