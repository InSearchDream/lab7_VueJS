<template>
  <div class="container">
    <h3>Вывод таблицы Trainer</h3>
    <div v-if="message" class="alert alert-success">{{ this.message }}</div>
    <div class="container">
      <table class="table">
        <thead>
          <tr>           
            <th>ФИО</th>
            <th>Телефон</th>
            <th>Дата рождения</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="trainer in trainers" v-bind:key="trainer.id">
            <td>{{ trainer.fio }}</td>
            <td>{{ trainer.phone }}</td>
            <td>{{ trainer.birthday }}</td>
          </tr>
        </tbody>
      </table>
      <div class="row">
        <button class="btn" v-on:click="addTrainer()">Добавить</button>
      </div>
    </div>
  </div>
</template>
<script>
import TrainerDataService from "../service/TrainerDataService";

export default {
  name: "Trainers",
  data() {
    return {
      trainers: [],
      message: "",
    };
  },
  methods: {
    refreshTrainers() {
      TrainerDataService.retrieveAllTrainers().then((res) => {
        this.trainers = res.data;
      });
    },
    addTrainer() {
      this.$router.push(`/trainer/addTrainer`);
    },
  },
  created() {
    this.refreshTrainers();
  },
};
</script>