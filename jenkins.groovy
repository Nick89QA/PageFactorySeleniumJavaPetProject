task_branch = "${TEST_BRANCH_NAME}"
def branch_cutted = task_branch.contains("origin") ? task_branch.split('/')[1] : task_branch.trim()
currentBuild.displayName = "$branch_cutted"
base_git_url = "https://github.com/Nick89QA/PetProjectSelenium"


node {
    stage ('Build') {
        git url: 'https://github.com/cyrille-leclerc/multi-module-maven-project'
        withMaven {
            sh "mvn clean verify "
        } 
    }
}
